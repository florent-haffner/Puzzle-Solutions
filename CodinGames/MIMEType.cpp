#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

int main()
{
  int N; // Number of elements which make up the association table.
  std::cin >> N; std::cin.ignore();

  int Q; // Number Q of file names to be analyzed.
  std::cin >> Q; std::cin.ignore();

  for (int i = 0; i < N; i++) {
    std::string EXT; // file extension
    std::string MT; // MIME type.
    std::cin >> EXT >> MT; std::cin.ignore();
  }

  for (int i = 0; i < Q; i++) {
    std::string FNAME;
    std::getline(std::cin, FNAME); // One file name per line.
    if (FNAME) {
      std::cout << "UNKNOWN" << std::endl;
    }
  }

}

/**
  * INPUTS part 1
    3
    3
    html text/html
    png image/png
    gif image/gif
    animated.gif
    portrait.png
    index.html
  */

